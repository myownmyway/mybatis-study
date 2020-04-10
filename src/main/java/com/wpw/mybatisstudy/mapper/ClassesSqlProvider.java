package com.wpw.mybatisstudy.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author wpw
 */
public class ClassesSqlProvider {
    public String selectById(Integer id) {
        SQL sql = new SQL() {{
            SELECT("c.id cid,c.name cname,c.teacher_id teacher_id,t.id tid,t.name tname");
            FROM("classes c,teacher t");
            WHERE("c.teacher_id=t.id and c.id=#{id}");
        }};
        return sql.toString();
    }
}
