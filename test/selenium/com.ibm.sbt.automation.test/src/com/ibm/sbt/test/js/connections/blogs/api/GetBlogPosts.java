/*
 * � Copyright IBM Corp. 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.sbt.test.js.connections.blogs.api;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.sbt.automation.core.test.BaseApiTest;
import com.ibm.sbt.automation.core.test.pageobjects.JavaScriptPreviewPage;

/**
 * @author rajmeetbal
 *  
 * @date 08 May 2013
 */
public class GetBlogPosts extends BaseApiTest {
    
    static final String SNIPPET_ID = "Social_Blogs_API_GetBlogPosts";

    public GetBlogPosts() {
        setAuthType(AuthType.AUTO_DETECT);
    }
    
    @Test
    public void testGetBlogPosts() {
        JavaScriptPreviewPage previewPage = executeSnippet(SNIPPET_ID);
        List jsonList = previewPage.getJsonList();
        Assert.assertFalse("GetPublicActivityStream returned no results", jsonList.isEmpty());
    }

}