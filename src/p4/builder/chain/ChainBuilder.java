/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package p4.builder.chain;

import java.util.PrimitiveIterator;

/**
 *
 *
 * @author y30051466
 * @since 2024/4/20
 */
public class ChainBuilder {
    public static void main(String[] args) {
        User.Builder
    }
}

class User {
    private String name;

    private int age;

    static class Builder {
        private String name;

        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.name = this.name;
            user.age = this.age;
            return user;
        }
    }
}
