package ru.iteco.structural.home.adapters;

import ru.iteco.structural.home.DbUserEntity;
import ru.iteco.structural.home.DbUserInfoEntity;


public interface Target {

    void createUser(DbUserEntity entity);

    DbUserEntity readUser(Long id);

    void updateUser(DbUserEntity entity);

    void deleteUser(DbUserEntity entity);

    void createUserInfo(DbUserInfoEntity entity);

    DbUserInfoEntity readUserInfo(Long id);

    void updateUserInfo(DbUserInfoEntity entity);

    void deleteUserInfo(DbUserInfoEntity entity);
}
