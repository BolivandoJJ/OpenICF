/*
 * ====================
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2008-2009 Sun Microsystems, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License("CDDL") (the "License").  You may not use this file
 * except in compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://opensource.org/licenses/cddl1.php
 * See the License for the specific language governing permissions and limitations
 * under the License.
 *
 * When distributing the Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://opensource.org/licenses/cddl1.php.
 * If applicable, add the following below this CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * ====================
 * Portions Copyrighted 2010-2013 ForgeRock AS.
 */
package org.identityconnectors.framework.api.operations;

import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.ResultsHandler;
import org.identityconnectors.framework.common.objects.SearchResult;
import org.identityconnectors.framework.common.objects.filter.Filter;

public interface SearchApiOp extends APIOperation {

    /**
     * Search the resource for all objects that match the object class and
     * filter.
     *
     * @param objectClass
     *            reduces the number of entries to only those that match the
     *            {@link ObjectClass} provided.
     * @param filter
     *            Reduces the number of entries to only those that match the
     *            {@link Filter} provided, if any. May be null.
     * @param handler
     *            class responsible for working with the objects returned from
     *            the search.
     * @param options
     *            additional options that impact the way this operation is run.
     *            May be null.
     * @return The query result or {@code null}.
     * @throws RuntimeException
     *             if there is problem during the processing of the results.
     */
    public SearchResult search(final ObjectClass objectClass, final Filter filter,
            final ResultsHandler handler, final OperationOptions options);
}
