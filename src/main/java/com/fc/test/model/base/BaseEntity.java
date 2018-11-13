package com.fc.test.model.base;

import lombok.*;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    @Id
    @ColumnType(jdbcType = JdbcType.BIGINT)
    protected Long id;
    protected String createTime;
}
