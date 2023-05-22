import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient, HttpParams } from '@angular/common/http';
import { AppStore } from '../models/app-store.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private static appStore=new AppStore();
  constructor(private http: HttpClient) { }

  public isAuthenticated(): boolean {

    const remember = localStorage.getItem('remember');
    let token = null;
    if (remember && remember === 'true') {
      token = localStorage.getItem('token');
    } else {
      token = sessionStorage.getItem('token');
    }

    if (token) {
      return true;
    } else {
      return false;
    }
  }

  public isLocked(): boolean {

    let isLocked = null;
    const remember = localStorage.getItem('remember');
    if (remember && remember === 'true') {
      isLocked = localStorage.getItem('locked');
    } else {
      isLocked = sessionStorage.getItem('locked');
    }

    return isLocked === 'true';
  }

  // public login(credentials) {
  //   const email = credentials.email;
  //   const password = credentials.password;
  //   const tokenUrl = environment.apiUrl + '/token';
  //   const data = 'username=' + email + '&password=' + password + '&grant_type=password';
  //   const header = new HttpHeaders({ 'Content-Type': 'application/x-www-urlencoded', 'No-Auth': 'True' });
  //   return this.http.post(tokenUrl, data, { headers: header });
  // }

  // public retrieve(email: string) {
  //   const retrieveUrl = environment.apiUrl + '/retrieve';
  //   const body = new HttpParams().set('email', email);
  //   return this.http.post(retrieveUrl, body);
  // }

  public static get IsLoginActive() {
    return this.appStore.isLoginComplete;
  }
  public static set IsLoginActive(value) {
    this.appStore.isLoginComplete = value;
    this.appStore.isLoginComplete = value;
  }
}
