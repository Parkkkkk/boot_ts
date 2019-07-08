package com.timline.springwebservice;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface Usermapper {

    List<Map<String, Object>> getUser();
}