/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2015 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.core.util.service.type;


/**
 * ContextVariableNames can be added as a Job or Event detail in order to establish the context.
 * 
 * @see MultiTenantScheduledJobThreadInitializer in the BLC MultiTenant module.
 * @author bpolster
 *
 */
public class ContextVariableNames {

    public static String SITE = "SITE";
    public static String PROFILE = "PROFILE";
    public static String CATALOG = "CATALOG";
}
