import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { SettingsService } from 'src/app/services/settings.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  credentials={
    username:"",
    password:""

  }
  constructor(private settingsService: SettingsService, private router : Router){

  }
  login(){
    this.settingsService.login(this.credentials).subscribe((response:any)=>{
      if(response){
        AuthService.IsLoginActive=true;
        this.router.navigate(['/'])
      }
    })
  }
}
