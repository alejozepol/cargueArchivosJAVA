/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.cargueArchivo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author alejo
 */
@Named(value = "fileUploadFormBean")
@RequestScoped
public class FileUploadFormBean {

    private Part fileUpload;

    /**
     * Creates a new instance of FileUploadFormBean
     */
    public FileUploadFormBean() {
    }

    public Part getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(Part fileUpload) {
        this.fileUpload = fileUpload;
    }

}
