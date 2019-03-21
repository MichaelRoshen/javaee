##mybatis

application.properties
```ruby
mybatis.mapper-locations=classpath:mybatis/mapper/*.xml
```

等效于
mybatis-config.xml
```ruby
<mappers>
   <mapper resource="mybatis/mapper/UserMapper.xml"/>
</mappers>
```
