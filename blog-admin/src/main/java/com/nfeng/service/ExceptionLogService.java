package com.nfeng.service;

import org.springframework.scheduling.annotation.Async;
import com.nfeng.entity.ExceptionLog;

import java.util.List;

public interface ExceptionLogService {
	List<ExceptionLog> getExceptionLogListByDate(String startDate, String endDate);

	@Async
	void saveExceptionLog(ExceptionLog log);

	void deleteExceptionLogById(Long id);
}
