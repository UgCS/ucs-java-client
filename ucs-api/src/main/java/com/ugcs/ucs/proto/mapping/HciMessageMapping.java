package com.ugcs.ucs.proto.mapping;

import com.ugcs.ucs.proto.MessagesProto;
import com.ugcs.ucs.proto.MessagesProto.*;
import com.ugcs.ucs.proto.codec.ProtoMessageMapping;

public class HciMessageMapping extends ProtoMessageMapping {

	public HciMessageMapping() {
		putMapping(0, MessagesProto.Error.class);
		putMapping(1, Notification.class);
		putMapping(2, OperationStatus.class);
		putMapping(3, OperationStream.class);
		putMapping(4, OperationStreamRequest.class);
		putMapping(5, CancelOperationRequest.class);
		putMapping(6, CancelOperationResponse.class);

		putMapping(10, GetObjectListRequest.class);
		putMapping(11, GetObjectListResponse.class);
		putMapping(12, GetObjectRequest.class);
		putMapping(13, GetObjectResponse.class);
		putMapping(14, CreateOrUpdateObjectRequest.class);
		putMapping(15, CreateOrUpdateObjectResponse.class);
		putMapping(16, DeleteObjectRequest.class);
		putMapping(17, DeleteObjectResponse.class);
		putMapping(18, UpdateObjectFieldsRequest.class);
		putMapping(19, UpdateObjectFieldsResponse.class);
		putMapping(20, AuthorizeHciRequest.class);
		putMapping(21, AuthorizeHciResponse.class);
		putMapping(22, LoginRequest.class);
		putMapping(23, LoginResponse.class);
		putMapping(24, LogoutRequest.class);
		putMapping(25, LogoutResponse.class);
		putMapping(30, GetRasterGridRequest.class);
		putMapping(31, GetRasterGridResponse.class);
		putMapping(32, ProcessRouteRequest.class);
		putMapping(33, ProcessRouteResponse.class);
		putMapping(34, GetRasterValuesRequest.class);
		putMapping(35, GetRasterValuesResponse.class);
		putMapping(36, GetTelemetryRequest.class);
		putMapping(37, GetTelemetryResponse.class);
		putMapping(38, GetKmlRouteRepresentationRequest.class);
		putMapping(39, GetKmlRouteRepresentationResponse.class);
		putMapping(42, SetHciLocaleRequest.class);
		putMapping(43, SetHciLocaleResponse.class);
		putMapping(44, ConvertRouteAltitudesRequest.class);
		putMapping(45, ConvertRouteAltitudesResponse.class);
		putMapping(46, GetLineOfSightRequest.class);
		putMapping(47, GetLineOfSightResponse.class);
		putMapping(48, GetElevationProfileRequest.class);
		putMapping(49, GetElevationProfileResponse.class);
		putMapping(50, GetAdsbAircraftListRequest.class);
		putMapping(51, GetAdsbAircraftListResponse.class);
		putMapping(52, SearchPlacesRequest.class);
		putMapping(53, SearchPlacesResponse.class);
		putMapping(54, ExportRouteToXmlRequest.class);
		putMapping(55, ExportRouteToXmlResponse.class);
		putMapping(56, ImportRouteRequest.class);
		putMapping(57, ImportRouteResponse.class);
		putMapping(58, SubscribeEventRequest.class);
		putMapping(59, SubscribeEventResponse.class);
		putMapping(60, UnsubscribeEventRequest.class);
		putMapping(61, UnsubscribeEventResponse.class);
		putMapping(62, GetVehicleLogRequest.class);
		putMapping(63, GetVehicleLogResponse.class);
		putMapping(64, SendCommandRequest.class);
		putMapping(65, SendCommandResponse.class);
		putMapping(66, UploadRouteRequest.class);
		putMapping(67, UploadRouteResponse.class);
		putMapping(68, GetLicenseRequest.class);
		putMapping(69, GetLicenseResponse.class);
		putMapping(70, ActivateLicenseRequest.class);
		putMapping(71, ActivateLicenseResponse.class);
		putMapping(72, ExportMissionToXmlRequest.class);
		putMapping(73, ExportMissionToXmlResponse.class);
		putMapping(74, ImportMissionFromXmlRequest.class);
		putMapping(75, ImportMissionFromXmlResponse.class);
		putMapping(76, AcquireLockRequest.class);
		putMapping(77, AcquireLockResponse.class);
		putMapping(78, ReleaseLockRequest.class);
		putMapping(79, ReleaseLockResponse.class);
		putMapping(80, CheckLockRequest.class);
		putMapping(81, CheckLockResponse.class);
		putMapping(82, CheckMultipleLocksRequest.class);
		putMapping(83, CheckMultipleLocksResponse.class);
		putMapping(84, GetMissionPreferencesRequest.class);
		putMapping(85, GetMissionPreferencesResponse.class);
		putMapping(86, UpdateMissionPreferencesRequest.class);
		putMapping(87, UpdateMissionPreferencesResponse.class);
		putMapping(88, GetVehicleLogByTimeRangeRequest.class);
		putMapping(89, GetVehicleLogByTimeRangeResponse.class);
		putMapping(90, ExportTelemetryRequest.class);
		putMapping(91, ExportTelemetryResponse.class);
		putMapping(92, ImportTelemetryRequest.class);
		putMapping(93, ImportTelemetryResponse.class);
		putMapping(94, TraceTelemetryFramesRequest.class);
		putMapping(95, TraceTelemetryFramesResponse.class);
		putMapping(96, DeleteTelemetryRequest.class);
		putMapping(97, DeleteTelemetryResponse.class);
		putMapping(98, DeactivateLicenseRequest.class);
		putMapping(99, DeactivateLicenseResponse.class);
		putMapping(100, CheckForUpdatesRequest.class);
		putMapping(101, CheckForUpdatesResponse.class);
		putMapping(102, SendStatisticsRequest.class);
		putMapping(103, SendStatisticsResponse.class);
		putMapping(106, GetParametersSelectionValuesRequest.class);
		putMapping(107, GetParametersSelectionValuesResponse.class);
		putMapping(108, GetAdsbBulbStatusRequest.class);
		putMapping(109, GetAdsbBulbStatusResponse.class);
		putMapping(110, CountTelemetryRequest.class);
		putMapping(111, CountTelemetryResponse.class);
		putMapping(112, CalculateSplineRequest.class);
		putMapping(113, CalculateSplineResponse.class);
		putMapping(114, ChangeRouteVehicleProfileRequest.class);
		putMapping(115, ChangeRouteVehicleProfileResponse.class);
		putMapping(116, GetNfzListRequest.class);
		putMapping(117, GetNfzListResponse.class);
		putMapping(118, SubmitUtmOperationRequest.class);
		putMapping(119, SubmitUtmOperationResponse.class);
		putMapping(120, GetCapabilitiesRequest.class);
		putMapping(121, GetCapabilitiesResponse.class);
		putMapping(124, GetMappingRequest.class);
		putMapping(125, GetMappingResponse.class);
		putMapping(126, GetVehicleTracksRequest.class);
		putMapping(127, GetVehicleTracksResponse.class);
		putMapping(128, GetNativeRouteRequest.class);
		putMapping(129, GetNativeRouteResponse.class);
		putMapping(130, GetLocationPassingTimeRequest.class);
		putMapping(131, GetLocationPassingTimeResponse.class);
		putMapping(132, GetPolygonAreaRequest.class);
		putMapping(133, GetPolygonAreaResponse.class);
		putMapping(134, SplitRouteBySegmentsRequest.class);
		putMapping(135, SplitRouteBySegmentsResponse.class);
		putMapping(136, SplitRouteByDistanceRequest.class);
		putMapping(137, SplitRouteByDistanceResponse.class);
		putMapping(138, JoinRouteRequest.class);
		putMapping(139, JoinRouteResponse.class);
		putMapping(140, ReconstructRouteRequest.class);
		putMapping(141, ReconstructRouteResponse.class);
		putMapping(142, GetTrialSubscriptionsPlanRequest.class);
		putMapping(143, GetTrialSubscriptionsPlanResponse.class);
		putMapping(144, GetTrialRequest.class);
		putMapping(145, GetTrialResponse.class);
		putMapping(146, SwapElevationOrderRequest.class);
		putMapping(147, SwapElevationOrderResponse.class);
		putMapping(148, DeleteVehicleTrackRequest.class);
		putMapping(149, DeleteVehicleTrackResponse.class);
		putMapping(150, MergeVehicleTrackRequest.class);
		putMapping(151, MergeVehicleTrackResponse.class);
		putMapping(152, CheckLocationRequest.class);
		putMapping(153, CheckLocationResponse.class);
		putMapping(154, SplitVehicleTrackRequest.class);
		putMapping(155, SplitVehicleTrackResponse.class);
		putMapping(156, GetVehicleVideoLogRequest.class);
		putMapping(157, GetVehicleVideoLogResponse.class);

		putMapping(200, StreamTestRequest.class);
		putMapping(201, StreamTestResponse.class);
		putMapping(202, ProgressTestRequest.class);
		putMapping(203, ProgressTestResponse.class);
	}
}
