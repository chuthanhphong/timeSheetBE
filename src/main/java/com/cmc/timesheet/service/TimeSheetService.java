package com.cmc.timesheet.service;

import com.cmc.timesheet.model.request.TimeSheetFilterRequest;
import com.cmc.timesheet.model.request.TimeSheetInsertRequest;
import com.cmc.timesheet.model.request.TimeSheetViewDetailRequest;
import com.cmc.timesheet.model.response.TimeSheetResponse;
import com.cmc.timesheet.model.response.TimeSheetViewDetailResponse;

import java.util.List;

public interface TimeSheetService {

    /**
     *
     * @param listTimeSheet
     * @return
     */
    Boolean multipleInsertFromExelData(List<TimeSheetInsertRequest> listTimeSheet);

    /**
     *
     * @param timeSheetFilterRequest
     * @return
     */
    List<TimeSheetResponse> searchTimeSheet (TimeSheetFilterRequest timeSheetFilterRequest);

    /**
     *
     * @param timeSheetFilterRequest
     * @return
     */
    List<TimeSheetResponse> getTimeSheetDataForExcel (TimeSheetFilterRequest timeSheetFilterRequest);

    /**
     *
     * @param timeSheetFilterRequest
     * @return
     */
    Integer countTimeSheet(TimeSheetFilterRequest timeSheetFilterRequest);

    List<TimeSheetViewDetailResponse> getListTimeSheetByEmployeeId (TimeSheetViewDetailRequest request);
    List<TimeSheetViewDetailResponse> getListTimeSheetExcelByEmployeeId (TimeSheetViewDetailRequest request);

    void   deleteRecordViewDetail(String timeSheetId);

}
