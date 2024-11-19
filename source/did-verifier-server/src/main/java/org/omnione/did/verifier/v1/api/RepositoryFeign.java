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

package org.omnione.did.verifier.v1.api;


import org.omnione.did.verifier.v1.api.dto.DidDocApiResDto;
import org.omnione.did.verifier.v1.api.dto.VcMetaApiResDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign client for the Storage server.
 * This class was temporarily used instead of the BlockChain service and is no longer in use.
 */
@FeignClient(value = "Storage", url = "192.168.3.130:8097", path = "/repository/api/v1")
public interface RepositoryFeign {
    /**
     * Get DID Document
     * @param did DID
     * @return DidDocApiResDto
     */
    @GetMapping("/did-doc")
    DidDocApiResDto getDid(@RequestParam(name = "did") String did);

    /**
     * Get VC Meta Data
     * @param vcId VC ID23
     * @return VcMetaApiResDto
     */
    @GetMapping("/vc-meta")
    VcMetaApiResDto getVcMetaData(@RequestParam(name = "vcId") String vcId);
}
