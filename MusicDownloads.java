public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    for(DownloadInfo x: downloadList)
      if(x.getTitle().equals(title))
        return x;

    return null;


  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    for(String str: titles)
    {
      if(getDownloadInfo(str).equals(null))
      {
        DownloadInfo x = new DownloadInfo(str);
        x.incrementTimesDownloaded();
        downloadList.add(x);
      }
      else
      {
        getDownloadInfo(str).incrementTimesDownloaded();
      }
    }
  }
}
