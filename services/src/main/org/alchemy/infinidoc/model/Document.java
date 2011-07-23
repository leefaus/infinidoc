package org.alchemy.infinidoc.model;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author: leefaus
 * Create Date: 7/22/11
 * @version: v0.1
 */

@XmlType
public class Document {
    private DataHandler binaryDocument;

    @XmlMimeType("application/octet-stream")
    public DataHandler getBinaryDocument() {
        return binaryDocument;
    }

    public void setBinaryDocument(DataHandler binaryDocument) {
        this.binaryDocument = binaryDocument;
    }

}
