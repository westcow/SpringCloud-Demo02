package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private Integer sId;
    private String studentName;
    private String password;
}