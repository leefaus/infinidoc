package org.alchemy.infinidoc.services.soap;

import org.alchemy.infinidoc.model.Document;
import org.alchemy.infinidoc.services.IContentService;
import org.apache.log4j.Logger;

import javax.jws.WebService;

/**
 * @author: leefaus
 * Create Date: 7/22/11
 * @version: v0.1
 */

@WebService(endpointInterface = "org.alchemy.infinidoc.services.IContentService")
public class ContentImpl implements IContentService {
    Logger logger = Logger.getLogger(ContentImpl.class);

    public String createDocument(String repositoryId, String folderId, Document document) {
        return null;
    }

    public String createDocumentFromSource(String repositoryId, String folderId, org.alchemy.infinidoc.model.Content content) {
        return null;
    }

    public String createFolder(String repositoryId, String folderName) {
        return null;
    }
}
