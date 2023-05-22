import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class SettingsService {

  constructor(private http:HttpClient) { }

  login(userInfo:any){
    console.log(userInfo);
    return this.http.post('http://localhost:8080/api/v1/login',userInfo );

  }
}
