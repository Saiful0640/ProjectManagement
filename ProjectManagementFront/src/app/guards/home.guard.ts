import { Injectable } from "@angular/core";
import { CanActivate, Route, Router } from "@angular/router";
import { AuthService } from "../services/auth.service";

@Injectable({
  providedIn:'root'
})
export class HomeGuard implements CanActivate{
  constructor(private router:Router){}
    canActivate():boolean{
      console.log({Test:'TEST'})
      if(!AuthService.IsLoginActive){
        this.router.navigate(['user/login'])
        return false;
      }
      return true;

    }

}
