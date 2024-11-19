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

import org.omnione.did.verifier.v1.api.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * EnrollFeign This class is a Feign client for the TAS API.
 */
@FeignClient(value = "Tas", url = "${tas.url}", path = "/api/v1")
public interface EnrollFeign {
    /**
     * Request Enroll Entity API
     * @param request RequestEnrollEntityApiReqDto
     * @return RequestEnrollEntityApiResDto
     */
    @PostMapping("/request-enroll-entity")
    RequestEnrollEntityApiResDto requestEnrollEntityApi(@RequestBody RequestEnrollEntityApiReqDto request);
    /**
     * Request ECDH API
     * @param request RequestEcdhApiReqDto
     * @return RequestEcdhApiResDto
     */
    @PostMapping("/request-ecdh")
    RequestEcdhApiResDto requestEcdh(@RequestBody RequestEcdhApiReqDto request);
    /**
     * Propose Enroll Entity API
     * @param request ProposeEnrollEntityApiReqDto
     * @return ProposeEnrollEntityApiResDto
     */
    @PostMapping("/propose-enroll-entity")
    ProposeEnrollEntityApiResDto proposeEnrollEntityApi(@RequestBody ProposeEnrollEntityApiReqDto request);
    /**
     * Confirm Enroll Entity API
     * @param request ConfirmEnrollEntityApiReqDto
     * @return ConfirmEnrollEntityApiResDto
     */
    @PostMapping("/confirm-enroll-entity")
    ConfirmEnrollEntityApiResDto confirmEnrollEntityApi(@RequestBody ConfirmEnrollEntityApiReqDto request);
}
