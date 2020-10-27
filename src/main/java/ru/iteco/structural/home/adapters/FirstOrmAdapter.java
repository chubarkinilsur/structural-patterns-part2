package ru.iteco.structural.home.adapters;


import ru.iteco.structural.home.DbUserEntity;
import ru.iteco.structural.home.DbUserInfoEntity;
import ru.iteco.structural.home.orm.first.IFirstOrm;

import java.math.BigInteger;

public class FirstOrmAdapter implements Target {

   private final IFirstOrm firstOrm;

    public FirstOrmAdapter(IFirstOrm firstOrm) {
        this.firstOrm = firstOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        firstOrm.create(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return (DbUserEntity) firstOrm.read(BigInteger.valueOf(id).intValue());
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        firstOrm.update(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        firstOrm.delete(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        firstOrm.create(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return (DbUserInfoEntity) firstOrm.read(BigInteger.valueOf(id).intValue());
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        firstOrm.update(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        firstOrm.delete(entity);
    }
}
