package com.uchnion.web.dao;

import com.uchnion.web.model.Akun;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marojahan
 */
@Repository
public class DaoAkunImp implements DaoAkun {

    @Autowired
    private SessionFactory sessionfactory;

    private Session getSessionFactory() {
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertAkun(Akun akun) {
        getSessionFactory().save(akun);
    }

    @Override
    public void updateAkun(Akun akun) {
        Akun AkunUp = getAkun(akun.getAkunid());
        if (AkunUp != null) {
            AkunUp.setUserakun(akun.getUserakun());
            AkunUp.setPassakun(akun.getPassakun());

            getSessionFactory().update(AkunUp);
        }

    }

    @Override
    public void deleteAkun(Integer akunid) {
        Akun AkunDel = getAkun(akunid);
        if (AkunDel != null) {

            getSessionFactory().delete(AkunDel);
        }
    }

    @Override
    public Akun getAkun(Integer akunid) {
        return (Akun) getSessionFactory().get(Akun.class, akunid);
    }

    @Override
    public void selectAkun(Akun akun) {
        Akun AkunSel = getAkun(akun.getAkunid());

        if (AkunSel != null) {
            AkunSel.setUserakun(akun.getUserakun());
            AkunSel.setPassakun(akun.getPassakun());

            getSessionFactory().update(AkunSel);
        }
    }

    @Override
    public List<Akun> getAllAkun() {
        return getSessionFactory().createCriteria(Akun.class).list();
    }

    @Override
    public boolean isLogin(Akun akun) {
        Query query = getSessionFactory()
                .createQuery("from Akun where userakun=:user and passakun=:pass")
                .setParameter("user", akun.getUserakun())
                .setParameter("pass", akun.getPassakun());
        return query.list().size() > 0;
    }

}
