package com.authine.cloudpivot.ext.controller.base;

/**
 * ClassName UploadController
 * Description
 * Create by gfy
 * Date 2022/2/22 17:09
 */

import com.authine.cloudpivot.engine.spi.FileStoreService;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RequestMapping("/api/door")
@RestController
@Slf4j
public class UploadController extends SwBaseController {

    @Resource
    private FileStoreService fileStoreService;



    @PostMapping("/uplodfile")
    public ResponseResult uplodfile(@RequestBody MultipartFile file) throws Exception {
        if (file == null) {
            return this.getErrResponseResult(1L,"上传失败，上传的文件不能为空");
        }
//        System.out.println("asffsa"+file.getOriginalFilename());

        String filename=null;

//        if(file.getOriginalFilename().endsWith("txt")){
//            filename= IdUtils.getId()+".txt";
//        }else {
//            filename=IdUtils.getId()+".png";
//        }

        fileStoreService.fileUpload(filename, file.getInputStream());


        return getOkResponseResult("成功");
    }

}
