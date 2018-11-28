package com.slicepoker.zps.project.Moral.Service;

import com.slicepoker.zps.project.Moral.Pojo.MoralDeduction;
import com.slicepoker.zps.project.User.Pojo.Commes;

/**
 * @author Zps
 * @date 2018/11/28 16:06
 **/
public interface MoralDeductionService {

    Commes add(MoralDeduction moralDeduction);

    Commes delete(Long id);

    Commes findAll();

    Commes findByType(String moralDeductionType);

    Commes findmoralDeduction();

    Commes findMoralDeductionType();
}
