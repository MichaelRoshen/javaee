##mybatis


Spring Boot 会自动加载 spring.datasource.* 相关配置，数据源就会自动注入到 sqlSessionFactory 中，sqlSessionFactory 会自动注入到 Mapper 中


mybatis.config-location=classpath:mybatis/mybatis-config.xml
mybatis.mapper-locations=classpath:mybatis/mapper/*.xml
指定了 Mybatis 基础配置文件和实体类映射文件的地址


mybatis-config.xml 配置

<configuration>
    <typeAliases>
        <typeAlias alias="Integer" type="java.lang.Integer" />
        <typeAlias alias="Long" type="java.lang.Long" />
        <typeAlias alias="HashMap" type="java.util.HashMap" />
        <typeAlias alias="LinkedHashMap" type="java.util.LinkedHashMap" />
        <typeAlias alias="ArrayList" type="java.util.ArrayList" />
        <typeAlias alias="LinkedList" type="java.util.LinkedList" />
    </typeAliases>
</configuration>
这里也可以添加一些 Mybatis 基础的配置

等效于
mybatis-config.xml
```ruby
<mappers>
   <mapper resource="mybatis/mapper/UserMapper.xml"/>
</mappers>
```



resultMap（用于设置返回值的类型和映射关系）
```ruby
<resultMap id="userResultMap" type="com.chenc.demo.model.UserDO">
    <id property="id" column="id"/>
    <result property="name" column="name"/>
    <result property="address" column="address"/>
    <result property="age" column="age"/>
    <result property="sex" column="sex"/>
</resultMap>

可以使用resultType
<select id="list" resultType="com.chenc.demo.model.UserDO">
    select <include refid="Columns"/> from users
</select>

也可以用resultMap
<select id="list" resultMap="userResultMap">
    select <include refid="Columns"/> from users
</select>

<select id="show" resultMap="userResultMap" parameterType="java.lang.Long">
    select <include refid="Columns"/> from users where id = #{userId}
</select>
```