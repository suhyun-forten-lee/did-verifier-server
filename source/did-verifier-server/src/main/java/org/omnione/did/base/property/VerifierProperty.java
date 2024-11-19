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

package org.omnione.did.base.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;

/**
 * Configuration properties class for the Verifier.
 * This class maps configuration properties with the prefix "verifier" to its fields.
 *
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "verifier")
public class VerifierProperty {
    private String did;
    private String certVcRef;
    private String ref;
    private String samplePath;
    private ArrayList<String> verifierEndPoints = new ArrayList<>();
    private int validSeconds;
}