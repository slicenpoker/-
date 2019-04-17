package com.slicepoker.zps.project.StudentMoral.Pojo;

import com.slicepoker.zps.project.Util.BaseEntily;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Zps
 * @date 2019/4/17 11:32
 **/
@Entity
@Data
@Table(name="tb_student_moral_deduction_total")
public class StudentMoralDeductionTotal extends BaseEntily {

    private double studentMoralDeductionScoreTotal;

    private String year;

    private boolean deleted = false;
}
