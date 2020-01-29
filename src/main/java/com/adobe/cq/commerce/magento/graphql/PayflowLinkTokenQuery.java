/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Contains information used to generate PayPal iframe for transaction. Applies to Payflow Link and
 * Payments Advanced payment methods.
 */
public class PayflowLinkTokenQuery extends AbstractQuery<PayflowLinkTokenQuery> {
    PayflowLinkTokenQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Mode for Payflow transaction
     */
    public PayflowLinkTokenQuery mode() {
        startField("mode");

        return this;
    }

    /**
     * PayPal URL used for requesting Payflow form
     */
    public PayflowLinkTokenQuery paypalUrl() {
        startField("paypal_url");

        return this;
    }

    /**
     * Secure token generated by PayPal
     */
    public PayflowLinkTokenQuery secureToken() {
        startField("secure_token");

        return this;
    }

    /**
     * Secure token ID generated by PayPal
     */
    public PayflowLinkTokenQuery secureTokenId() {
        startField("secure_token_id");

        return this;
    }
}
