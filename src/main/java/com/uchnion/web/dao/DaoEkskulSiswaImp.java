//package com.uchnion.web.dao;
//
//import com.uchnion.web.model.EkskulSiswa;
//import com.uchnion.web.model.EkskulSiswaId;
//import java.util.List;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
///**
// *
// * @author Marojahan
// */
//@Repository
//public class DaoEkskulSiswaImp implements DaoEkskulSiswa{
//
//     @Autowired
//    private SessionFactory sessionfactory;
//    
//    private Session getSessionFactory(){
//        return sessionfactory.getCurrentSession();
//    }
//    
//    @Override
//    public void insertEkskulSiswa(EkskulSiswa ekskulsis) {
//        getSessionFactory().save(ekskulsis);
//    }
//
//    @Override
//    public void updateEkskulSiswa(EkskulSiswa ekskulsis) {
//        EkskulSiswa EkskulSiswaUp = getEkskulSiswa(ekskulsis.getPk_eks());
//       
//       if(EkskulSiswaUp != null){
//           EkskulSiswaUp.setNilai_ekskul(ekskulsis.getNilai_ekskul());
//           EkskulSiswaUp.setTahun_ajar(ekskulsis.getTahun_ajar());
//           EkskulSiswaUp.setSemester(ekskulsis.getSemester());
//           
//           getSessionFactory().update(EkskulSiswaUp);
//       }
//    }
//
//    @Override
//    public void deleteEkskulSiswa(EkskulSiswaId pk_eks) {
//        EkskulSiswa ekssisDel = getEkskulSiswa(pk_eks);
//        if (ekssisDel != null){
//            getSessionFactory().delete(ekssisDel);
//        }
//    }
//
//    @Override
//    public EkskulSiswa getEkskulSiswa(EkskulSiswaId pk_eks) {
//        return (EkskulSiswa)getSessionFactory().get(EkskulSiswa.class, pk_eks);
//    }
//
//    @Override
//    public void selectEkskulSiswa(EkskulSiswa ekskulsis) {
//        EkskulSiswa ekssisSel = getEkskulSiswa(ekskulsis.getPk_eks());
//        if (ekskulsis != null){
//            ekssisSel.setNilai_ekskul(ekskulsis.getNilai_ekskul());
//            ekssisSel.setSemester(ekskulsis.getSemester());
//            ekssisSel.setTahun_ajar(ekskulsis.getTahun_ajar());
//            
//            getSessionFactory().update(ekssisSel);
//        }
//    }
//
//    @Override
//    public List<EkskulSiswa> getAllEkskulSiswa() {
//        return getSessionFactory().createCriteria(EkskulSiswa.class).list();
//    }
//    
//}
