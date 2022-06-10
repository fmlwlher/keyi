package com.shaoshi.yixue.repository;

import com.shaoshi.yixue.entity.CalendarDay;
import com.shaoshi.yixue.entity.CalendarStr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wanglh
 * @date 2022/4/9 20:52
 */
public interface CalendarStrRepository extends JpaRepository<CalendarStr,Integer>, JpaSpecificationExecutor<CalendarStr> {
}