package ru.iteco.structural.home.adapters;

import ru.iteco.structural.home.DbUserEntity;
import ru.iteco.structural.home.DbUserInfoEntity;
import ru.iteco.structural.home.orm.second.ISecondOrm;

public class SecondOrmAdapter implements Target {
    private final ISecondOrm secondOrm;

    public SecondOrmAdapter(ISecondOrm secondOrm) {
        this.secondOrm = secondOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return getDbUserEntityById(id);
    }

    private DbUserEntity getDbUserEntityById(Long id) {
        return secondOrm.getContext().getUsers().stream().filter(dbUserEntity -> dbUserEntity.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        deleteUser(getDbUserEntityById(entity.getId()));
        createUser(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().remove(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().add(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return getDbUserInfoEntityById(id);
    }

    private DbUserInfoEntity getDbUserInfoEntityById(Long id) {
        return secondOrm.getContext().getUserInfos().stream().filter(dbUserEntity -> dbUserEntity.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        deleteUserInfo(getDbUserInfoEntityById(entity.getId()));
        createUserInfo(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().remove(entity);
    }
}
