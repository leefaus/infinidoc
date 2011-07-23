package org.alchemy.infinidoc.services.rest;

import org.alchemy.infinidoc.model.Content;
import org.alchemy.infinidoc.model.Document;
import org.alchemy.infinidoc.model.Simple;
import org.alchemy.infinidoc.services.IContentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author: leefaus
 * Create Date: 7/22/11
 * @version: v0.1
 */

@Path(value = "/content/")
public class ContentImpl implements IContentService {

    public String createDocument(String repositoryId, String folderId, Document document) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String createDocumentFromSource(String repositoryId, String folderId, Content content) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String createFolder(String repositoryId, String folderName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

/*  Simple JSON Example
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Simple getAllObjects() {
        Simple s = new Simple();
        s.setGender(Simple.Gender.MALE);
        Simple.Name n = new Simple.Name();
        n.setFirst("Lee");
        n.setLast("Faus");
        s.setName(n);
        s.setVerified(true);
        return s;
    }
    */
}
