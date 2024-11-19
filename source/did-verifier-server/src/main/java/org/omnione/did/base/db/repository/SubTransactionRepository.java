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

package org.omnione.did.base.db.repository;

import org.omnione.did.base.db.domain.SubTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository interface for SubTransaction entity operations.
 * Provides CRUD operations for SubTransaction entities and custom query methods.
 *
 */
public interface SubTransactionRepository extends JpaRepository<SubTransaction, Long> {

    /**
     * Finds the most recent SubTransaction for a given transaction ID.
     * The result is ordered by the step field in descending order, returning the highest step.
     *
     * @param transactionId The ID of the parent transaction.
     * @return An Optional containing the most recent SubTransaction if found, or an empty Optional if not found.
     */
    Optional<SubTransaction> findFirstByTransactionIdOrderByStepDesc(Long transactionId);
}