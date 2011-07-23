package org.alchemy.infinidoc.services;

import org.alchemy.infinidoc.model.Content;
import org.alchemy.infinidoc.model.Document;

import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author: leefaus
 * Create Date: 7/22/11
 * @version: v0.1
 */

@WebService
public interface IContentService {

    @WebResult(name="status", targetNamespace = "http://services.infinidoc.alchemy.com")
    public String createDocument(String repositoryId, String folderId, Document document);

    @WebResult(name="status", targetNamespace = "http://services.infinidoc.alchemy.com")
    public String createDocumentFromSource(String repositoryId, String folderId, Content content);

    @WebResult(name="status", targetNamespace = "http://services.infinidoc.alchemy.com")
    public String createFolder(String repositoryId, String folderName);
}
