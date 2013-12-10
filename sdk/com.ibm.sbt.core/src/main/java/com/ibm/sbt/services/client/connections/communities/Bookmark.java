package com.ibm.sbt.services.client.connections.communities;

import org.w3c.dom.Node;

import com.ibm.commons.xml.NamespaceContext;
import com.ibm.commons.xml.xpath.XPathExpression;
import com.ibm.sbt.services.client.base.AtomEntity;
import com.ibm.sbt.services.client.base.BaseService;

/**
 * This File represents Community Bookmark

 * @author Swati Singh
 */

public class Bookmark extends AtomEntity{

	public Bookmark(CommunityService communityService, String id) {
		super(communityService, id);
	}

	public Bookmark(BaseService service, Node node, NamespaceContext namespaceCtx, XPathExpression xpathExpression) {
		super(service, node, namespaceCtx, xpathExpression);
	}
	

}
