package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class akr
  extends adm
{
  public int hQX;
  public bg hQY;
  public h hQZ;
  public yo hRa;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (hLQ == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (hLQ != null)
      {
        paramVarArgs.bN(1, hLQ.kS());
        hLQ.a(paramVarArgs);
      }
      paramVarArgs.bM(2, hQX);
      if (hQY != null)
      {
        paramVarArgs.bN(3, hQY.kS());
        hQY.a(paramVarArgs);
      }
      if (hQZ != null)
      {
        paramVarArgs.bN(4, hQZ.kS());
        hQZ.a(paramVarArgs);
      }
      if (hRa != null)
      {
        paramVarArgs.bN(5, hRa.kS());
        hRa.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (hLQ == null) {
        break label787;
      }
    }
    label787:
    for (paramInt = a.a.a.a.bJ(1, hLQ.kS()) + 0;; paramInt = 0)
    {
      int i = paramInt + a.a.a.a.bI(2, hQX);
      paramInt = i;
      if (hQY != null) {
        paramInt = i + a.a.a.a.bJ(3, hQY.kS());
      }
      i = paramInt;
      if (hQZ != null) {
        i = paramInt + a.a.a.a.bJ(4, hQZ.kS());
      }
      paramInt = i;
      if (hRa != null) {
        paramInt = i + a.a.a.a.bJ(5, hRa.kS());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], hfZ);
        for (paramInt = adm.a(paramVarArgs); paramInt > 0; paramInt = adm.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.aVo();
          }
        }
        if (hLQ != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        akr localakr = (akr)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ck();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((ck)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hLQ = ((ck)localObject1);
            paramInt += 1;
          }
        case 2: 
          hQX = jMD.aVp();
          return 0;
        case 3: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bg();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((bg)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hQY = ((bg)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new h();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((h)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hQZ = ((h)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new yo();
          localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
          for (bool = true; bool; bool = ((yo)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
          hRa = ((yo)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.akr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */