/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package create.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}

class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello world!");
    }
}

// 单例模式的几种实现方式
//  1、懒汉式，线程不安全
class SingleObjectLazy {
    private static SingleObjectLazy instance;
    private SingleObjectLazy(){}

    public static SingleObjectLazy getInstance() {
        if (instance == null) {
            instance = new SingleObjectLazy();
        }
        return instance;
    }
}

// 2. 懒汉式，线程安全
class SingleLazySync {
    private static SingleLazySync instance;
    private SingleLazySync(){}
    public static synchronized SingleLazySync getInstance() {
        if (instance == null) {
            instance = new SingleLazySync();
        }
        return instance;
    }
}

// 3.懒汉式
class SingleLazyClassInit {
    private static SingleLazyClassInit instance = new SingleLazyClassInit();
    private SingleLazyClassInit(){}
    public static SingleLazyClassInit getInstance() {
        return instance;
    }
}
