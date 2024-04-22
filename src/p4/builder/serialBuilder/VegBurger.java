/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package p4.builder.serialBuilder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger ";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
