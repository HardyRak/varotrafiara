package com.cloud.varotrafiara.service;

import java.util.Date;
import java.util.List;

import com.cloud.varotrafiara.model.Commission;

public interface CommissionService {
    List<Commission> getAll();
    List<Commission> getByDate(Date date);
    Commission saveCommission(Commission commission);
    List<Commission> getById(Long id);
}
