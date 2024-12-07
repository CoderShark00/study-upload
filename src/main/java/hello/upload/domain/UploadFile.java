package hello.upload.domain;


import lombok.Data;


@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;   // 다른사용자가 같은이름의 파일을 올릴수도있기때문에 하나더만듬

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
