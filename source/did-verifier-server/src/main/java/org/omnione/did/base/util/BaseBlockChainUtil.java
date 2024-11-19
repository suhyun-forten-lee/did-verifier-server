/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.base.util;

import org.omnione.did.ContractApi;
import org.omnione.did.ContractFactory;
import org.omnione.did.base.exception.ErrorCode;
import org.omnione.did.base.exception.OpenDidException;
import org.omnione.did.data.model.did.DidDocAndStatus;
import org.omnione.exception.BlockChainException;

/**
 * This class provides utility methods for interacting with the blockchain.
 * It provides methods for registering and updating DID documents, as well as for registering and updating verifiable credentials (VCs).
 */
public class BaseBlockChainUtil {

    private static ContractApi contractApiInstance = getContractApiInstance();


    /**
     * Initializes the blockchain.
     *
     * @return The ContractApi instance.
     * @throws OpenDidException if the blockchain initialization fails.
     */
    public static ContractApi initBlockChain() {
        return ContractFactory.FABRIC.create("properties/blockchain.properties");
    }

    /**
     * Gets the ContractApi instance.
     *
     * @return The ContractApi instance.
     */
    public static ContractApi getContractApiInstance() {
        if (contractApiInstance == null) {
            synchronized (BaseBlockChainUtil.class) {
                if (contractApiInstance == null) {
                    contractApiInstance = initBlockChain();
                }
            }
        }
        return contractApiInstance;
    }


    /**
     * Find DID Document
     *
     * @param didKeyUrl The Decentralized Identifier (DID) to look up.
     * @return DidDocAndStatus containing the DID document and its status.
     * @throws OpenDidException if the DID is invalid or not found.
     */
    public static DidDocAndStatus findDidDocument(String didKeyUrl) {
        try {
            ContractApi contractApi = getContractApiInstance();
            return (DidDocAndStatus) contractApi.getDidDoc(didKeyUrl);
        } catch (BlockChainException e) {
            System.out.println("Failed to get DID Document: " + e.getMessage());
            throw new OpenDidException(ErrorCode.BLOCKCHAIN_GET_DID_DOC_FAILED);
        }
    }

}
