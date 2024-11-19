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

import org.omnione.did.base.db.domain.E2e;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for E2e entity operations.
 * Provides CRUD operations for E2e entities and custom query methods.
 *
 */
@Repository
public interface E2eRepository extends JpaRepository<E2e, Long> {

    /**
     * Finds an E2e entity by its associated transaction ID.
     *
     * @param transactionId The ID of the transaction to search for.
     * @return An Optional containing the E2e entity if found, or an empty Optional if not found.
     */
    Optional<E2e> findByTransactionId(Long transactionId);
}