package org.demo.layui.sqlutil;

import org.mybatis.generator.api.ShellRunner;

/**
 * Created by zhaol on 2018/11/19.
 */
public class SqlMain {

    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\generatorConfig.xml", "-overwrite" };
        ShellRunner.main(args);
    }

}
