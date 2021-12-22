/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.assesment1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Swift3
 */
@Controller
public class DatabaseController {
    
    @CrossOrigin
    @RequestMapping("/mahasiswa")
    @ResponseBody
    public List<Mahasiswa> getMahasiswa(){
        
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        
        MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try {
            mahasiswa = controller.findMahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;
    }
    //-----------------------------------------------
    @CrossOrigin
    @RequestMapping(value = "/mahasiswa/xml", 
           produces = {
            MediaType.APPLICATION_XML_VALUE
           })
    @ResponseBody
    public List<Mahasiswa> getMahasiswaXML(){
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try {
            mahasiswa = controller.findMahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;        
    }
    //------------------------------------------------
    @CrossOrigin
    @RequestMapping(value = "/mahasiswa/json", 
           produces = {
            MediaType.APPLICATION_JSON_VALUE
           })
    @ResponseBody
    public List<Mahasiswa> getMahasiswaJSON(){
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try {
            mahasiswa = controller.findMahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;
    }
    
}