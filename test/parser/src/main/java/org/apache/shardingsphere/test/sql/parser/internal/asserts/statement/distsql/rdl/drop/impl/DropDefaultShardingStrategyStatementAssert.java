/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.test.sql.parser.internal.asserts.statement.distsql.rdl.drop.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.sharding.distsql.parser.statement.DropDefaultShardingStrategyStatement;
import org.apache.shardingsphere.test.sql.parser.internal.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.sql.parser.internal.jaxb.cases.domain.statement.distsql.rdl.drop.DropDefaultShardingStrategyStatementTestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Drop default sharding strategy statement assert.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DropDefaultShardingStrategyStatementAssert {
    
    /**
     * Assert drop default sharding strategy statement is correct with expected parser result.
     *
     * @param assertContext assert context
     * @param actual actual drop default sharding strategy  statement
     * @param expected expected drop default sharding strategy  statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final DropDefaultShardingStrategyStatement actual, final DropDefaultShardingStrategyStatementTestCase expected) {
        if (null == expected) {
            assertNull(assertContext.getText("Actual statement should not exist."), actual);
        } else {
            assertNotNull(assertContext.getText("Actual statement should exist."), actual);
            assertThat(assertContext.getText("default sharding strategy  assertion error: "), actual.getDefaultType(), is(expected.getDefaultType()));
            assertThat(assertContext.getText("default sharding strategy  assertion error: "), actual.isIfExists(), is(expected.isIfExists()));
        }
    }
}