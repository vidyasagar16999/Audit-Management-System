import { inject, TestBed } from '@angular/core/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { HttpTestingController, HttpClientTestingModule } from '@angular/common/http/testing';
import { AuthorizationMSClientService } from './authorization-msclient.service';
import { Microservices } from '../Models/Microservices'

describe('AuthorizationMSClientService', () => {
  let service: AuthorizationMSClientService;
  let httpMock : HttpTestingController;
  let httpClient : HttpClient;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[HttpClientTestingModule],
      providers:[AuthorizationMSClientService]
    });
    service = TestBed.inject(AuthorizationMSClientService);
    httpMock = TestBed.inject(HttpTestingController);
    httpClient = TestBed.inject(HttpClient);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it("test the project manager login",() =>{
    const AuthenticationRequest:any={
      "username": "akhil",
      "password": "akhil1137"
    };
  const dummyToken:any={
    "token": "dummytokenstringtestvalidation"
  };
  service.authenticate(AuthenticationRequest).subscribe(data =>{expect(data).toEqual(dummyToken)
  
  });

  const req = httpMock.expectOne(service._url+"auth/authenticate");
    expect(req.request.method).toEqual('POST');
    expect(req.request.body).toEqual(AuthenticationRequest);

const expectedResponse = new HttpResponse({ status: 200, statusText: 'OK', body: dummyToken });
req.event(expectedResponse)

  
});



});
