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

package org.omnione.did.base.db.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Entity class representing End-to-End (E2E) encryption details.
 * This class stores information related to E2E encryption sessions,
 * including session keys, nonces, and encryption parameters.
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "e2e")
public class E2e extends BaseEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "session_key", nullable = false, length = 300)
    private String sessionKey;
    @Column(name = "nonce", nullable = false, length = 100)
    private String nonce;
    @Column(name = "curve")
    private String curve;
    @Column(name = "cipher", nullable = false, length = 20)
    private String cipher;
    @Column(name = "padding", nullable = false, length = 20)
    private String padding;
    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;
}