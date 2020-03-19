package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//数据库实体类
public class Books {
    private int bookID;
    private  String bookName;
    private int bookCounts;
    private  String detail;
}
