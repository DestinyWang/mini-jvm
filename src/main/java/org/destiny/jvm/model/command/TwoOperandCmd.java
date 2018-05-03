package org.destiny.jvm.model.command;

import org.destiny.jvm.model.constant.ConstantPool;

/**
 * @author 王康
 * hzwangkang1@corp.netease.com
 * ------------------------------------------------------------------
 * <p></p>
 * ------------------------------------------------------------------
 * Corpright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * @version JDK 1.8.0_101
 * @since 2017/8/22 16:38
 */
public abstract class TwoOperandCmd extends ByteCodeCmd {

    private ConstantPool constantPool;



    public TwoOperandCmd(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public int getLength() {
        return 3;
    }

    @Override
    public String toString() {
        return "TwoOperandCmd{" +
                "constantPool=" + constantPool +
                '}';
    }
}
