/*
 * Class: UnzipFileTest
 *
 * Created on Mar 14, 2022
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package org.wso2.carbon.connector.operations;

import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.wso2.connector.integration.test.base.ConnectorIntegrationTestBase;

public class UnzipFileTest extends ConnectorIntegrationTestBase{

    @BeforeClass(alwaysRun = true)
    private void setupEnviroment() {
    }
    
    @Test
    public void decompressFile_TarGzFile_Success() {
    }
}