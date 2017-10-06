package com.edu.taotao.solr;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月6日
 * @description
 */
public class TestSolr {

	@Test
	public void testSolr() throws Exception {
		SolrServer solrServer = new HttpSolrServer("http://192.168.37.130:8080/solr");
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", 1);
		document.addField("name", "淘淘商城");
		solrServer.add(document);
		solrServer.commit();
	}

}
