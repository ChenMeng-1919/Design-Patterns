package com.designpatterns.demo.FilterPattern;

import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/8/16 17:13
 * @description:为标准（Criteria）创建一个接口。
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
