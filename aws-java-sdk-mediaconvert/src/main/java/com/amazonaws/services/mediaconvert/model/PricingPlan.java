/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specifies whether the pricing plan for the queue is On-demand or Reserved. The pricing plan for the queue determines
 * whether you pay On-demand or Reserved pricing for the transcoding jobs that you run through the queue. For Reserved
 * queue pricing, you must set up a contract. You can create a Reserved queue contract through the AWS Elemental
 * MediaConvert console.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PricingPlan {

    ON_DEMAND("ON_DEMAND"),
    RESERVED("RESERVED");

    private String value;

    private PricingPlan(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return PricingPlan corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PricingPlan fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PricingPlan enumEntry : PricingPlan.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
