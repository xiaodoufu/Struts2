package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

public class UserAction extends ActionSupport {

     private File upload;  //上传的文件
    /**
     * 在FileUploadInterceptor拦截器中有默认的设置 会获取文件名和文件类型
     * 必须是前台from表单中的name属性值 + FileName/ContentType
     */
    private String  uploadFileName;  //文件的名称
    private String  uploadContentType;  //文件的类型

    public String  upload(){
       String path= ServletActionContext.getServletContext().getRealPath("/upload");
       String name= path+File.separatorChar+uploadFileName;
        System.out.println(name+"*****************"+uploadContentType);
        try {
            FileUtils.copyFile(upload,new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
      return  SUCCESS;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
}
